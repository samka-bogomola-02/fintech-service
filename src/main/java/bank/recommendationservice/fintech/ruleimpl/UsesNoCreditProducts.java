package bank.recommendationservice.fintech.ruleimpl;

import bank.recommendationservice.fintech.exception.NullArgumentException;
import bank.recommendationservice.fintech.exception.RepositoryNotInitializedException;
import bank.recommendationservice.fintech.other.ProductType;
import bank.recommendationservice.fintech.repository.RecommendationsRepository;
import bank.recommendationservice.fintech.interfaces.Rule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Правило:
 * Пользователь не использует продукты с типом CREDIT
 */
@Component
public class UsesNoCreditProducts implements Rule {
    private static final Logger logger = LoggerFactory.getLogger(UsesNoCreditProducts.class);
    private final RecommendationsRepository recommendationsRepository;

    public UsesNoCreditProducts(RecommendationsRepository recommendationsRepository) {
        if (recommendationsRepository == null) {
            logger.error("RecommendationsRepository не должен быть null");
            throw new RepositoryNotInitializedException("recommendationsRepository не должен быть null");
        }
        this.recommendationsRepository = recommendationsRepository;
    }

    @Override
    public boolean evaluate(UUID userId) {
        if (userId == null) {
            logger.error("userId не должен быть null");
            throw new NullArgumentException("userId не должен быть null");
        }
        return !recommendationsRepository.usesProductOfType(userId, ProductType.CREDIT.name());
    }
}
