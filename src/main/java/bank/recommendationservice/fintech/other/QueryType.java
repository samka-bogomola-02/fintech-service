package bank.recommendationservice.fintech.other;

public enum QueryType {
    USER_OF("USER_OF"),

    ACTIVE_USER_OF("ACTIVE_USER_OF"),

    TRANSACTION_SUM_COMPARE("TRANSACTION_SUM_COMPARE"),

    TRANSACTION_SUM_COMPARE_DEPOSIT_WITHDRAW("TRANSACTION_SUM_COMPARE");

    QueryType(String queryType) {
    }
}