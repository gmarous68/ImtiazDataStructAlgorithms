package repetition.files_and_exception;

import repetition.exceptions.FooRuntimeException;

public class MyFileUtils {
    public int sub10FromLargerNumber(int num) throws FooRuntimeException {
        if(num < 10)
            throw new FooRuntimeException("No less than 10");
        return num - 10;
    }
}