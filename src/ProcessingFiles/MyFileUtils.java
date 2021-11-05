package ProcessingFiles;

import FooRuntimeException.FooRuntimeException;

public class MyFileUtils {
	public int subtract10FromlargerNumber(int num) throws FooRuntimeException {
		if (num < 10)
			throw new FooRuntimeException("The number past was smaller than 10");

		return num - 10;
	}
}
