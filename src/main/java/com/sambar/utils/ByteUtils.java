/**
 * 
 */
package com.sambar.utils;

import java.nio.ByteBuffer;

/**
 * This class is written to support my day today tasks 
 */
public class ByteUtils {

	/**
	 * “How many numbers can you represent in 4 bytes?”
	 * 
	 * 1 byte has 8 bits, so 4 bytes have 32 bits.
	 * 
	 * Each bit can have 2 distinct states, so we have 232 distinct combinations of
	 * bits (in 4 bytes) which correspond to 232 distinct whole numbers.
	 * 
	 * Normally, the range is 0 to 4,294,967,295 but if you want to allow negatives,
	 * the range is -2,147,483,648 to 2,147,483,647
	 * 
	 * @param number
	 * @return
	 */
	public static byte[] intToBytes(int number) {
		return ByteBuffer.allocate(4).putInt(number).array();
	}

	/**
	 * convert byte array to int
	 * 
	 * @param arr
	 * @return
	 */
	public static int bytesToInt(byte[] arr) {
		return ByteBuffer.wrap(arr).getInt();
	}

	public static void main(String[] args) {
		byte[] bytes = ByteUtils.intToBytes(2147483647);
		for (byte b : bytes) {
			System.out.format("0x%x ", b);
		}
		System.out.println(ByteUtils.bytesToInt(bytes));
	}
}
