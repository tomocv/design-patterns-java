import java.util.function.Supplier;

class SingletonTester
{
    public static boolean isSingleton(Supplier<Object> func)
    {
        // todo
        return func.get() == func.get();
    }
}