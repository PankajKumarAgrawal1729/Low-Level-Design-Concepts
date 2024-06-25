package BehavioralDesignPattern.InterpreterDesignPattern.ExpressionExample;

public class NumberTerminalExpression implements AbstractExpression {
    String stringValue;

    public NumberTerminalExpression(String stringValue) {
        this.stringValue = stringValue;
    }

    @Override
    public int interpret(Context context) {
        return context.get(stringValue);
    }
}
