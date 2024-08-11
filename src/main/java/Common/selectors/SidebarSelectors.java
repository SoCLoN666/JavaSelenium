package Common.selectors;

public enum SidebarSelectors {
    TOGGLE_EXPANDED("sidebar-toggle"),

    TOGGLE_COLLAPSED("sidebar-toggle-copy"),

    ELEMENT("sidebar"),

    ADD_RECIPE_BTN("add-recipe-btn"),

    ALL_RECIPES_BTN("0"),

    UKRAINIAN_RECIPES_BTN("1"),

    ITALIAN_RECIPES_BTN("2"),

    FRENCH_RECIPES_BTN("3"),

    JAPANESE_RECIPES_BTN("4"),

    NO_CATEGORY_RECIPES_BTN("5");

    public String selector;

    private SidebarSelectors(String selector) {
        this.selector = selector;
    }
}

