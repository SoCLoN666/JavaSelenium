package Common;

public enum UrlList {
    RECIPES("https://recipe-application-pearl.vercel.app/all-recipies");


    public String url;
    private UrlList(String urls){
        this.url = urls;
    }
}
