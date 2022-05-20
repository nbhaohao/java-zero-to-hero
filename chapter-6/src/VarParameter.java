public class VarParameter {
    public static void main(String[] args) {
        VarParameterResolver varParameter = new VarParameterResolver();
        System.out.println(varParameter.test(1, 2));
        System.out.println(varParameter.test(1, 2, 3));
    }
}

class VarParameterResolver {
    public int test(int... number) {
        int result = 0;
        for (int i = 0; i < number.length; i++) {
            result += number[i];
        }
        return result;
    }
}
