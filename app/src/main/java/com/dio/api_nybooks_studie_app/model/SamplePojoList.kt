package com.dio.api_nybooks_studie_app.model

import retrofit2.http.Body

abstract class SamplePojoList():List<SamplePojo> {



  var listPojo: SamplePojo = SamplePojo()

}