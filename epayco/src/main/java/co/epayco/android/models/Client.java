package co.epayco.android.models;


public class Client {

    String tokenId, name, email, phone;
    String  franchise;
    String mask;
    String customer_id;
    Boolean defaultCard = true;


    public Client() {}

    public Client(
            String tokenId,
            String name,
            String email,
            String phone,
            String franchise,
            String mask,
            String customer_id,
            Boolean defaultCard
            )
    {
        this.tokenId = tokenId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.franchise = franchise;
        this.mask = mask;
        this.customer_id = customer_id;
        this.defaultCard = defaultCard;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getDefaultCard() {
        return defaultCard;
    }

    public void setDefaultCard(Boolean defaultCard) {
        this.defaultCard = defaultCard;
    }

    public String getFranchise() {
        return franchise;
    }

    public void setFranchise(String franchise) {
        this.franchise = franchise;
    }

    public String getMask() {
        return mask;
    }
    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
}
