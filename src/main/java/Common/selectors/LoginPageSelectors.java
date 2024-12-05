package Common.selectors;

public enum LoginPageSelectors {
    USERNAME_FIELD("input.ml-1"),

    PASSWORD_FIELD("input.ml-2"),

    LOGIN("button");


    public final String selector;

    LoginPageSelectors(String selector) {
        this.selector = selector;
    }
}
