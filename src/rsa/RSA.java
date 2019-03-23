package vn.bluesky.crypt.rsa;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;

public class RSA{

    private BigInteger n, d, e;
	private int bitLength = 512;
	private ArrayList<String> plainList = null;
	private ArrayList<String> cipherList = null;
	private ArrayList<String> inputList = null;
	private int[] ciphertextSize = null;
	
	/** Create an instance that can encrypt using someone elses public key. */
	public RSA(BigInteger n, BigInteger e) {
		n = n;
	    e = e;
	}
	
	/** Create an instance that can both encrypt and decrypt. */
	public RSA(int bits) {
		bitLength = bits;
	    SecureRandom r = new SecureRandom();
	    BigInteger p = new BigInteger(bitLength / 2, 100, r);
	    BigInteger q = new BigInteger(bitLength / 2, 100, r);
	    n = p.multiply(q);
	    BigInteger m = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
	    e = new BigInteger("3");
	    while (m.gcd(e).intValue() > 1) {
	    	e = e.add(new BigInteger("2"));
	    }
	    d = e.modInverse(m);
	    
	}
	
	/** Encrypt the plaintext message. */
	private String encrypt(String message) {
	    return (new BigInteger(message.getBytes())).modPow(e, n).toString();
	}
	
	/** Decrypt the ciphertext message. */
	private String decrypt(String message) {
	    return new String((new BigInteger(message)).modPow(d, n).toByteArray());
	}
	
	/** Generate a new public and private key set. */
	public synchronized void generateKeys() {
	    SecureRandom r = new SecureRandom();
	    BigInteger p = new BigInteger(bitLength / 2, 100, r);
	    BigInteger q = new BigInteger(bitLength / 2, 100, r);
	    n = p.multiply(q);
	    BigInteger m = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
	    e = new BigInteger("3");
	    while (m.gcd(e).intValue() > 1) {
	    	e = e.add(new BigInteger("2"));
	    }
	    d = e.modInverse(m);
	}
	
	/** Return the modulus. */
	public BigInteger getN() {
	    return n;
	}
	
	/** Return the public key. */
	public BigInteger getE() {
		return e;
	}
	
	/** Return the plaintext after decryption */
	public byte[] getPlaintext(){
		String output = "";
		if(plainList == null){
			output = "There is no plaintext to return";
			return output.getBytes();
		}
		for(int i = 0; i<plainList.size(); i++){
			output += plainList.get(i);
		}
		BigInteger temp = new BigInteger(output);
		return temp.toByteArray();
        }
	
	/** Return the ciphertext after encryption */
	public byte[] getCiphertext(){
		String output = "";
		if(cipherList == null){
			output = "There is no ciphertext to return";
			return output.getBytes();
		}
		for(int i = 0; i<cipherList.size(); i++){
			output += cipherList.get(i);
		}
		BigInteger temp = new BigInteger(output);
		return temp.toByteArray();
	}
	
	public int[] getCiphertextSize(){
		return ciphertextSize;
	}
	
	/** Encryption function */
	public void encryption(byte[] inputByte){
		BigInteger inputInt = new BigInteger(inputByte);
		String input = inputInt.toString();
		String ciphertext;
		inputList = new ArrayList<>();
		cipherList = new ArrayList<>();
		
		int n = (input.length() % 64 == 0)?input.length()/64:(input.length()/64 + 1);
	    for(int i = 0; i < n ; i++){
	    	String str = new String();
	    	if(i == n-1)
	    		str = input.substring(i*64, input.length());
	    	else
	    		str = input.substring(i*64,(i+1)*64);
	    	inputList.add(str);
	    }
	    
	    ciphertextSize = new int[inputList.size()];
	    for(int i = 0; i<inputList.size(); i++){
	    	ciphertext = encrypt(inputList.get(i));
	    	System.out.println("Cipher Text: " + ciphertext);
	    	cipherList.add(ciphertext.toString());
	    	ciphertextSize[i] = ciphertext.toString().length();
	    }
	    inputList.clear(); inputList = null;
	}
	
	/** Decryption function */
	public void decryption(byte[] inputByte, int[] inputSize){
		BigInteger inputInt = new BigInteger(inputByte);
		String input = inputInt.toString();
		System.out.println("Cipher Text: " + input.length());
		String plaintext;
		inputList = new ArrayList<>();
		plainList = new ArrayList<>();
		
		int n = inputSize.length;
		int sum = 0;
		for(int i = 0; i < n ; i++){
	    	String str = new String();
	    	System.out.println(inputSize[i]);
	    	if(i == 0)
	    		str = input.substring(0, sum = inputSize[i]);
	    	else{
	    		str = input.substring(sum, sum + inputSize[i]);
	    		sum += inputSize[i];
	    	}
	    	System.out.println(str);
	    	inputList.add(str);
	    }
		
		for(int i = 0; i<inputList.size(); i++){
			plaintext = decrypt(inputList.get(i));
			System.out.println("Plain Text: " + plaintext);
			plainList.add(plaintext);
		}
		inputList.clear(); inputList = null;
	}
}
