/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.joda.time.LocalDate;
import org.joda.time.DateTime;
import java.math.BigDecimal;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FakeApi
 */
public class FakeApiTest {

    private final FakeApi api = new FakeApi();

    
    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testEndpointParametersTest() throws ApiException {
        BigDecimal number = null;
        Double _double = null;
        String string = null;
        byte[] _byte = null;
        Integer integer = null;
        Integer int32 = null;
        Long int64 = null;
        Float _float = null;
        byte[] binary = null;
        LocalDate date = null;
        DateTime dateTime = null;
        String password = null;
        // api.testEndpointParameters(number, _double, string, _byte, integer, int32, int64, _float, binary, date, dateTime, password);

        // TODO: test validations
    }
    
    /**
     * To test enum query parameters
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testEnumQueryParametersTest() throws ApiException {
        String enumQueryString = null;
        BigDecimal enumQueryInteger = null;
        Double enumQueryDouble = null;
        // api.testEnumQueryParameters(enumQueryString, enumQueryInteger, enumQueryDouble);

        // TODO: test validations
    }
    
}
