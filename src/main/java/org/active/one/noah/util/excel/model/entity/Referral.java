package org.active.one.noah.util.excel.model.entity;

// Referral POJO
public class Referral {

    private String customer;

    private String idType;

    private String paymentWay;

    private String notes;

    private String addProduct;

    private String quantityProduct;

    private String addService;

    private String quantityService;

    private String addPlan;

    private String quantityPlan;

    private String discountTypeProduct;

    private String discountValueProduct;

    private String discountTypeService;

    private String discountValueService;

    private String discountTypePlan;

    private String discountValuePlan;

    private String productPrice;

    private String servicePrice;

    private String planPrice;

    private String taxProduct;

    private String taxService;

    private String taxPlan;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(String paymentWay) {
        this.paymentWay = paymentWay;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getAddProduct() {
        return addProduct;
    }

    public void setAddProduct(String addProduct) {
        this.addProduct = addProduct;
    }

    public String getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(String quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    public String getAddService() {
        return addService;
    }

    public void setAddService(String addService) {
        this.addService = addService;
    }

    public String getQuantityService() {
        return quantityService;
    }

    public void setQuantityService(String quantityService) {
        this.quantityService = quantityService;
    }

    public String getAddPlan() {
        return addPlan;
    }

    public void setAddPlan(String addPlan) {
        this.addPlan = addPlan;
    }

    public String getQuantityPlan() {
        return quantityPlan;
    }

    public void setQuantityPlan(String quantityPlan) {
        this.quantityPlan = quantityPlan;
    }

    public String getDiscountTypeProduct() {
        return discountTypeProduct;
    }

    public void setDiscountTypeProduct(String discountTypeProduct) {
        this.discountTypeProduct = discountTypeProduct;
    }

    public String getDiscountValueProduct() {
        return discountValueProduct;
    }

    public void setDiscountValueProduct(String discountValueProduct) {
        this.discountValueProduct = discountValueProduct;
    }

    public String getDiscountTypeService() {
        return discountTypeService;
    }

    public void setDiscountTypeService(String discountTypeService) {
        this.discountTypeService = discountTypeService;
    }

    public String getDiscountValueService() {
        return discountValueService;
    }

    public void setDiscountValueService(String discountValueService) {
        this.discountValueService = discountValueService;
    }

    public String getDiscountTypePlan() {
        return discountTypePlan;
    }

    public void setDiscountTypePlan(String discountTypePlan) {
        this.discountTypePlan = discountTypePlan;
    }

    public String getDiscountValuePlan() {
        return discountValuePlan;
    }

    public void setDiscountValuePlan(String discountValuePlan) {
        this.discountValuePlan = discountValuePlan;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(String servicePrice) {
        this.servicePrice = servicePrice;
    }

    public String getPlanPrice() {
        return planPrice;
    }

    public void setPlanPrice(String planPrice) {
        this.planPrice = planPrice;
    }

    public String getTaxProduct() {
        return taxProduct;
    }

    public void setTaxProduct(String taxProduct) {
        this.taxProduct = taxProduct;
    }

    public String getTaxService() {
        return taxService;
    }

    public void setTaxService(String taxService) {
        this.taxService = taxService;
    }

    public String getTaxPlan() {
        return taxPlan;
    }

    public void setTaxPlan(String taxPlan) {
        this.taxPlan = taxPlan;
    }

    @Override
    public String toString() {
        return "Referral{" +
                "customer='" + customer + '\'' +
                ", idType='" + idType + '\'' +
                ", paymentWay='" + paymentWay + '\'' +
                ", notes='" + notes + '\'' +
                ", addProduct='" + addProduct + '\'' +
                ", quantityProduct='" + quantityProduct + '\'' +
                ", addService='" + addService + '\'' +
                ", quantityService='" + quantityService + '\'' +
                ", addPlan='" + addPlan + '\'' +
                ", quantityPlan='" + quantityPlan + '\'' +
                ", discountTypeProduct='" + discountTypeProduct + '\'' +
                ", discountValueProduct='" + discountValueProduct + '\'' +
                ", discountTypeService='" + discountTypeService + '\'' +
                ", discountValueService='" + discountValueService + '\'' +
                ", discountTypePlan='" + discountTypePlan + '\'' +
                ", discountValuePlan='" + discountValuePlan + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", servicePrice='" + servicePrice + '\'' +
                ", planPrice='" + planPrice + '\'' +
                ", taxProduct='" + taxProduct + '\'' +
                ", taxService='" + taxService + '\'' +
                ", taxPlan='" + taxPlan + '\'' +
                '}';
    }
}
