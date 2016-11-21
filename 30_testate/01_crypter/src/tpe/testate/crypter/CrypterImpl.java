package tpe.testate.crypter;

public class CrypterImpl implements Crypter
{

	@Override
	public String encrypt(String input)
	{
		input = input.toLowerCase();

		String code = "";

		for (int i = 0; i < input.length(); i++)
		{
			switch(input.charAt(i))
			{
			case 'a':
				code += '4';
				break;
			case 'b':
				code += input.charAt(i);
				break;
			case 'c':
				code += input.charAt(i);
				break;
			case 'd':
				code += input.charAt(i);
				break;
			case 'e':
				code += '3';
				break;
			case 'f':
				code += input.charAt(i);
				break;
			case 'g':
				code += input.charAt(i);
				break;
			case 'h':
				code += input.charAt(i);
				break;
			case 'i':
				code += input.charAt(i);
				break;
			case 'j':
				code += input.charAt(i);
				break;
			case 'k':
				code += input.charAt(i);
				break;
			case 'l':
				code += '1';
				break;
			case 'm':
				code += input.charAt(i);
				break;
			case 'n':
				code += input.charAt(i);
				break;
			case 'o':
				code += '0';
				break;
			case 'p':
				code += input.charAt(i);
				break;
			case 'q':
				code += input.charAt(i);
				break;
			case 'r':
				code += input.charAt(i);
				break;
			case 's':
				code += input.charAt(i);
				break;
			case 't':
				code += '7';
				break;
			case 'u':
				code += input.charAt(i);
				break;
			case 'v':
				code += input.charAt(i);
				break;
			case 'w':
				code += input.charAt(i);
				break;
			case 'x':
				code += input.charAt(i);
				break;
			case 'y':
				code += input.charAt(i);
				break;
			case 'z':
				code += input.charAt(i);
				break;
			case '0':
				code += 'o';
				break;
			case '1':
				code += 'l';
				break;
			case '2':
				code += input.charAt(i);
				break;
			case '3':
				code += 'e';
				break;
			case '4':
				code += 'a';
				break;
			case '5':
				code += input.charAt(i);
				break;
			case '6':
				code += input.charAt(i);
				break;
			case '7':
				code += 't';
				break;
			case '8':
				code += input.charAt(i);
				break;
			case '9':
				code += input.charAt(i);
				break;
			case ' ':
				code += input.charAt(i);
			}
		}

		return code;
	}

	@Override
	public String decrypt(String input) throws IllegalArgumentException
	{
		String code = "";

		for (int i = 0; i < input.length(); i++)
		{
			switch(input.charAt(i))
			{
			case 'a':
				code += '4';
				break;
			case 'b':
				code += input.charAt(i);
				break;
			case 'c':
				code += input.charAt(i);
				break;
			case 'd':
				code += input.charAt(i);
				break;
			case 'e':
				code += '3';
				break;
			case 'f':
				code += input.charAt(i);
				break;
			case 'g':
				code += input.charAt(i);
				break;
			case 'h':
				code += input.charAt(i);
				break;
			case 'i':
				code += input.charAt(i);
				break;
			case 'j':
				code += input.charAt(i);
				break;
			case 'k':
				code += input.charAt(i);
				break;
			case 'l':
				code += '1';
				break;
			case 'm':
				code += input.charAt(i);
				break;
			case 'n':
				code += input.charAt(i);
				break;
			case 'o':
				code += '0';
				break;
			case 'p':
				code += input.charAt(i);
				break;
			case 'q':
				code += input.charAt(i);
				break;
			case 'r':
				code += input.charAt(i);
				break;
			case 's':
				code += input.charAt(i);
				break;
			case 't':
				code += '7';
				break;
			case 'u':
				code += input.charAt(i);
				break;
			case 'v':
				code += input.charAt(i);
				break;
			case 'w':
				code += input.charAt(i);
				break;
			case 'x':
				code += input.charAt(i);
				break;
			case 'y':
				code += input.charAt(i);
				break;
			case 'z':
				code += input.charAt(i);
				break;
			case '0':
				code += 'o';
				break;
			case '1':
				code += 'l';
				break;
			case '2':
				code += input.charAt(i);
				break;
			case '3':
				code += 'e';
				break;
			case '4':
				code += 'a';
				break;
			case '5':
				code += input.charAt(i);
				break;
			case '6':
				code += input.charAt(i);
				break;
			case '7':
				code += 't';
				break;
			case '8':
				code += input.charAt(i);
				break;
			case '9':
				code += input.charAt(i);
				break;
			case ' ':
				code += input.charAt(i);
				break;
			default:
				throw new IllegalArgumentException();
			}
		}

		return code;
	}

}
