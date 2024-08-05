package com.aurionpro.solution.model;

public class TaxCalculator {
    private ILogger logger;

    public TaxCalculator(ILogger logger) {
        this.logger = logger;
    }

    public ILogger getLogger() {
        return logger;
    }

    public void setLogger(ILogger logger) {
        this.logger = logger;
    }

    public int calculateTax(int amount, int rate) {
        int tax = amount / rate;
        logger.log();
        return tax;
    }
}
