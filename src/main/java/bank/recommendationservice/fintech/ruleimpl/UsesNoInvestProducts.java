//package bank.recommendationservice.fintech.ruleimpl;
//
//import bank.recommendationservice.fintech.ProductType;
//import bank.recommendationservice.fintech.repository.RecommendationsRepository;
//import bank.recommendationservice.fintech.interfaces.Rule;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import java.util.UUID;
//
///**
// * Правило:
// * Пользователь не использует продукты с типом INVEST
// */
//@Component
//public class UsesNoInvestProducts implements Rule {
//    private static final Logger logger = LoggerFactory.getLogger(UsesNoInvestProducts.class);
//    private final RecommendationsRepository recommendationsRepository;
//
//    public UsesNoInvestProducts(RecommendationsRepository recommendationsRepository) {
//        if (recommendationsRepository == null) {
//            logger.error("RecommendationsRepository не должен быть null");
//            throw new IllegalArgumentException("recommendationsRepository не должен быть null");
//        }
//        this.recommendationsRepository = recommendationsRepository;
//    }
//
//    @Override
//    public boolean evaluate(UUID userId) {
//        if (userId == null) {
//            logger.error("userId не должен быть null");
//            throw new IllegalArgumentException("userId не должен быть null");
//        }
//
//        boolean result = !recommendationsRepository.usesProductOfType(userId, ProductType.INVEST.name());
//
//        logger.info("Проверка: Пользователь с ID {} использует инвестиционные продукты: {}", userId, !result);
//
//        return result;
//    }
//}