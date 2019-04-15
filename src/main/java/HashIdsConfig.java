public class HashIdsConfig {

    private String salt;
    private Integer length;
    private String alphabet;

    public HashIdsConfig(String salt, Integer length, String alphabet) {
        this.salt = salt;
        this.length = length;
        this.alphabet = alphabet;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }
}
