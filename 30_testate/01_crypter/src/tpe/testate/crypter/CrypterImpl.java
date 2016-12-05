package tpe.testate.crypter;

/**
 * Implements the Interface Crypter and can be used to encrypt and decrypt strings.
 * @author Christopher
 *
 */
public class CrypterImpl implements Crypter
{
	private final String clear = "abcdefghijklmnopqrstuvwxyz0123456789 ";
	private final String cypher = "4bcd3fghijk1mn0pqrs7uvwxyzol2ea56t89 ";


	/**
	 * @see Crypter
	 */
	@Override
	public String encrypt(String input)
	{
		input = input.toLowerCase();
		return crypt(input, clear, cypher);
	}

	/**
	 * @see Crypter
	 */
	@Override
	public String decrypt(String input) throws IllegalArgumentException
	{
		String invalid = input;

		for (int i = 0; i < cypher.length(); i++)
		{
			invalid = invalid.replaceAll(Character.toString(cypher.charAt(i)), "");
		}

		if (input.equals(input.toLowerCase()) && invalid.equals(""))
		{
			return crypt(input, cypher, clear);
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Internal helper method to encrypt and decrypt strings.
	 * @param input A string that will be encrypted or decrypted.
	 * @param inputChars A string that represents all valid symbols of the input.
	 * @param outputChars A string that represents the crypted version of inputChars.
	 * @return The encrypted or decrypted string.
	 */
	private String crypt(String input, String inputChars, String outputChars)
	{
		String code = "";

		for (int i = 0; i < input.length(); i++)
		{
			for (int j = 0; j < cypher.length(); j++)
			{
				if (input.charAt(i) == clear.charAt(j))
				{
					code += cypher.charAt(j);
				}
			}
		}

		return code;
	}
}
