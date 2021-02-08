package com.amex.mailservice

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.kafka.test.context.EmbeddedKafka
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
@EmbeddedKafka
class MailserviceApplicationTests {

	@Test
	fun contextLoads() {
	}

}
