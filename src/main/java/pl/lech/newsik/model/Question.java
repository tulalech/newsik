package pl.lech.newsik.model;

public class Question {
    private String searchText;
    private String lang = "pl";

    public Question(String searchText, String lang) {
        this.searchText = searchText;
        this.lang = lang;
    }

    public Question() {
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

}
