package chapter14_Lambda.listing8;
import java.io.IOException;
import java.io.Reader;
@FunctionalInterface
interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}
