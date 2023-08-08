/*
 * Cloud App API
 * Test api for Cloud App
 *
 * OpenAPI spec version: 1.0.11
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for VpsApi
 */
@Ignore
public class VpsApiTest {

    private final VpsApi api = new VpsApi();

    /**
     * Updates a vps info with form data
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateVpsWithFormTest() throws Exception {
        Long vpsid = null;
        Long ram = null;
        Integer cpu = null;
        Long storage = null;
        String os = null;
        String ip = null;
        api.updateVpsWithForm(vpsid, ram, cpu, storage, os, ip);

        // TODO: test validations
    }
}