package org.restaurant.service.buy;

/**
 * Buy operation result.
 * Created by juanjosejimenezfernandez on 24/12/16.
 */
public class BuyOperationResult {

    private boolean producedErrorDuringOperation;

    private String errorDescription;

    /**
     * Constructor with parameters.
     *
     * @param producedErrorDuringOperation if producer error during operation.
     * @param errorDescription             error description.
     */
    public BuyOperationResult(boolean producedErrorDuringOperation, String errorDescription) {
        this.producedErrorDuringOperation = producedErrorDuringOperation;
        this.errorDescription = errorDescription;
    }

    /**
     * Check if operation have errors.
     *
     * @return true if operation have error, false in other case.
     */
    public boolean haveErrors() {
        return producedErrorDuringOperation;
    }

    /**
     * Get error description if exists.
     *
     * @return Error description.
     */
    public String getErrorDescription() {
        return errorDescription;
    }
}
