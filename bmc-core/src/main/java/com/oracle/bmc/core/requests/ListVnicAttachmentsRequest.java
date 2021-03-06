/**
 * Copyright (c) 2016-2017 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.requests;

import java.io.*;
import java.util.*;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

import com.oracle.bmc.model.*;
import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Builder(builderClassName = "Builder")
@Getter
public class ListVnicAttachmentsRequest {

    /**
     * The OCID of the compartment.
     */
    private String compartmentId;

    /**
     * The name of the Availability Domain.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     */
    private String availabilityDomain;

    /**
     * The OCID of the instance.
     */
    private String instanceId;

    /**
     * The maximum number of items to return in a paginated \"List\" call.
     * <p>
     * Example: `500`
     *
     */
    private Integer limit;

    /**
     * The value of the `opc-next-page` response header from the previous \"List\" call.
     *
     */
    private String page;

    /**
     * The OCID of the VNIC.
     */
    private String vnicId;
}
