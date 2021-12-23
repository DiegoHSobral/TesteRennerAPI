package post.teste;

import org.hamcrest.Matchers;
import org.junit.Test;
import io.restassured.RestAssured;

public class ValidaPost {
	@Test
	public void validarCadastroNovo() {
		RestAssured.given()
		.contentType("application/json")
		.body("{\r\n"
				+ "    \"name\": \"Diego Henrique\",\r\n"
				+ "    \"job\": \"analista QA\"\r\n"
				+ "}")
		.when().post("https://reqres.in/api/users")
		.then().log().all()
		.statusCode(201)
		.body("name", Matchers.is("Diego Henrique"));
		System.out.println("---CT01 - Cadastro Efetuado com Sucesso---");
		
	}

}
