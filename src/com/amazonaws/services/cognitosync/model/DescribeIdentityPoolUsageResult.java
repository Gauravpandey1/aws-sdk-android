/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

/**
 * Describe Identity Pool Usage Result
 */
public class DescribeIdentityPoolUsageResult implements Serializable {

    private IdentityPoolUsage identityPoolUsage;

    /**
     * Returns the value of the IdentityPoolUsage property for this object.
     *
     * @return The value of the IdentityPoolUsage property for this object.
     */
    public IdentityPoolUsage getIdentityPoolUsage() {
        return identityPoolUsage;
    }
    
    /**
     * Sets the value of the IdentityPoolUsage property for this object.
     *
     * @param identityPoolUsage The new value for the IdentityPoolUsage property for this object.
     */
    public void setIdentityPoolUsage(IdentityPoolUsage identityPoolUsage) {
        this.identityPoolUsage = identityPoolUsage;
    }
    
    /**
     * Sets the value of the IdentityPoolUsage property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identityPoolUsage The new value for the IdentityPoolUsage property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeIdentityPoolUsageResult withIdentityPoolUsage(IdentityPoolUsage identityPoolUsage) {
        this.identityPoolUsage = identityPoolUsage;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityPoolUsage() != null) sb.append("IdentityPoolUsage: " + getIdentityPoolUsage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolUsage() == null) ? 0 : getIdentityPoolUsage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeIdentityPoolUsageResult == false) return false;
        DescribeIdentityPoolUsageResult other = (DescribeIdentityPoolUsageResult)obj;
        
        if (other.getIdentityPoolUsage() == null ^ this.getIdentityPoolUsage() == null) return false;
        if (other.getIdentityPoolUsage() != null && other.getIdentityPoolUsage().equals(this.getIdentityPoolUsage()) == false) return false; 
        return true;
    }
    
}
    