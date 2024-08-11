package Common.selectors;

public enum LoginPageSelectors {
    USERNAME_FIELD("input.ml-1"),

    PASSWORD_FIELD("input.ml-2"),

    LOGIN("button");

    public String selector;

    private LoginPageSelectors(String selector) {
        this.selector = selector;
    }
}
