/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * The ClearRange model.
 */
@JacksonXmlRootElement(localName = "ClearRange")
public final class ClearRange {
    /**
     * The start property.
     */
    @JsonProperty(value = "Start", required = true)
    private int start;

    /**
     * The end property.
     */
    @JsonProperty(value = "End", required = true)
    private int end;

    /**
     * Get the start value.
     *
     * @return the start value.
     */
    public int start() {
        return this.start;
    }

    /**
     * Set the start value.
     *
     * @param start the start value to set.
     * @return the ClearRange object itself.
     */
    public ClearRange withStart(int start) {
        this.start = start;
        return this;
    }

    /**
     * Get the end value.
     *
     * @return the end value.
     */
    public int end() {
        return this.end;
    }

    /**
     * Set the end value.
     *
     * @param end the end value to set.
     * @return the ClearRange object itself.
     */
    public ClearRange withEnd(int end) {
        this.end = end;
        return this;
    }
}