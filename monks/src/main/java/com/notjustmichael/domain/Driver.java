package com.notjustmichael.domain;

public class Driver {
    private String dNo, dName, dPhNo;

    public Driver(Builder builder) {
        this.dNo = dNo;
        this.dName = dName;
        this.dPhNo = dPhNo;
    }


    public static class Builder{
        private String dNo, dName, dPhNo;

        public Builder dPhNo( String dPhNo) {
            this.dPhNo = dPhNo;
            return this;
        }

        public Builder dName( String dName) {
            this.dName = dName;
            return this;
        }

        public Builder phNo( String phNo) {
            this.dPhNo = phNo;
            return this;
        }

        public Driver build() {
            return new Driver(this);
        }
        
    }


}
