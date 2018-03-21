package org.ingini.kubecat.api;

public enum AlertType {

    ORDER(Constants.ORDER_VALUE), BILLING(Constants.BILLING_VALUE), SHIPPING(Constants.SHIPPING_VALUE);

    AlertType(String shippingValue) {
    }

    public static class Constants {
        public static final String ORDER_VALUE = "ORDER_ALERT";
        public static final String BILLING_VALUE = "BILLING_ALERT";
        public static final String SHIPPING_VALUE = "SHIPPING_ALERT";
    }
}
