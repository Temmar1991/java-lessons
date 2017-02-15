package main.ua.lessons;

public class Calculator {
	/**
		��������� ����������
		
	*/
	
	private int result;
	
	/**
		��������� ���������
		@param params ��������� ������������
	*/
	
	
	public void add (int ... params){
		for (Integer param: params)
		{
			this.result += param;
		}
	}

	/**
	 * ��������� ��������
	 * @param param �������� ���������
	 * @throws UserException ���� ���������� ���, �� ���������� ����������.
     */

	public void div(int ... param) throws UserException
	{
		if (param.length > 0)  {
			this.result = param[0];
			for (int arg : param)
			{
				if (arg == 0)
				{
					throw new IllegalArgumentException("You try div by 0, Please change arg!");
				}
				this.result /= arg;

			}
		} else {
			throw new UserException("You should enter arg!");
		}
	}
	
	public int getresult()
	{
		return this.result;
	}
	
	
	public void clearresult()
	{
		this.result = 0;
	}
	
	
}