/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies whether the model container is in Amazon ECR or a private Docker registry in your Amazon Virtual Private
 * Cloud (VPC).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ImageConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Set this to one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Platform</code> - The model image is hosted in Amazon ECR.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPC</code> - The model image is hosted in a private Docker registry in your VPC.
     * </p>
     * </li>
     * </ul>
     */
    private String repositoryAccessMode;

    /**
     * <p>
     * Set this to one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Platform</code> - The model image is hosted in Amazon ECR.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPC</code> - The model image is hosted in a private Docker registry in your VPC.
     * </p>
     * </li>
     * </ul>
     * 
     * @param repositoryAccessMode
     *        Set this to one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Platform</code> - The model image is hosted in Amazon ECR.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VPC</code> - The model image is hosted in a private Docker registry in your VPC.
     *        </p>
     *        </li>
     * @see RepositoryAccessMode
     */

    public void setRepositoryAccessMode(String repositoryAccessMode) {
        this.repositoryAccessMode = repositoryAccessMode;
    }

    /**
     * <p>
     * Set this to one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Platform</code> - The model image is hosted in Amazon ECR.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPC</code> - The model image is hosted in a private Docker registry in your VPC.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Set this to one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Platform</code> - The model image is hosted in Amazon ECR.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VPC</code> - The model image is hosted in a private Docker registry in your VPC.
     *         </p>
     *         </li>
     * @see RepositoryAccessMode
     */

    public String getRepositoryAccessMode() {
        return this.repositoryAccessMode;
    }

    /**
     * <p>
     * Set this to one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Platform</code> - The model image is hosted in Amazon ECR.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPC</code> - The model image is hosted in a private Docker registry in your VPC.
     * </p>
     * </li>
     * </ul>
     * 
     * @param repositoryAccessMode
     *        Set this to one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Platform</code> - The model image is hosted in Amazon ECR.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VPC</code> - The model image is hosted in a private Docker registry in your VPC.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryAccessMode
     */

    public ImageConfig withRepositoryAccessMode(String repositoryAccessMode) {
        setRepositoryAccessMode(repositoryAccessMode);
        return this;
    }

    /**
     * <p>
     * Set this to one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Platform</code> - The model image is hosted in Amazon ECR.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPC</code> - The model image is hosted in a private Docker registry in your VPC.
     * </p>
     * </li>
     * </ul>
     * 
     * @param repositoryAccessMode
     *        Set this to one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Platform</code> - The model image is hosted in Amazon ECR.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VPC</code> - The model image is hosted in a private Docker registry in your VPC.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryAccessMode
     */

    public ImageConfig withRepositoryAccessMode(RepositoryAccessMode repositoryAccessMode) {
        this.repositoryAccessMode = repositoryAccessMode.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRepositoryAccessMode() != null)
            sb.append("RepositoryAccessMode: ").append(getRepositoryAccessMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageConfig == false)
            return false;
        ImageConfig other = (ImageConfig) obj;
        if (other.getRepositoryAccessMode() == null ^ this.getRepositoryAccessMode() == null)
            return false;
        if (other.getRepositoryAccessMode() != null && other.getRepositoryAccessMode().equals(this.getRepositoryAccessMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryAccessMode() == null) ? 0 : getRepositoryAccessMode().hashCode());
        return hashCode;
    }

    @Override
    public ImageConfig clone() {
        try {
            return (ImageConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ImageConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
