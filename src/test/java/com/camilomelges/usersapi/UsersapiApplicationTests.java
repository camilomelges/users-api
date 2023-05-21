package com.camilomelges.usersapi;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.shaded.com.google.common.collect.ImmutableList;

@SpringBootTest
@Testcontainers
class UsersapiApplicationTests {

	private static final GenericContainer POSTGRES_CONTAINER = new GenericContainer<>("postgres:latest")
			.withEnv("POSTGRES_DB", "postgres")
			.withEnv("POSTGRES_USER", "postgres")
			.withEnv("POSTGRES_PASSWORD", "root");

	@BeforeAll
	static void beforeAll() {
		POSTGRES_CONTAINER.setPortBindings(ImmutableList.of("0.0.0.0:5432:5432"));
		POSTGRES_CONTAINER.start();
	}
	@AfterAll
	static void afterAll() {
		POSTGRES_CONTAINER.stop();
	}
	@Test
	public void contextLoads() {
		assert(POSTGRES_CONTAINER.isRunning());
	}
}
