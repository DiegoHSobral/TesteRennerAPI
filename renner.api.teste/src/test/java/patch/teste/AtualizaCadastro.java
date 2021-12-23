package patch.teste;

import org.hamcrest.Matchers;
import org.junit.Test;

import io.restassured.RestAssured;

public class AtualizaCadastro {
	
	@Test
	public void AtualizarUsuario() {
		RestAssured.given()
		.contentType("application/json")
		.body("{\r\n"
				+ "    \"name\": \"rafael jorge santos pereira\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}")
		.when().patch("https://reqres.in/api/users/811")
		.then().log().all()
		.statusCode(200)
		.body("name", Matchers.is("rafael jorge santos pereira"));
		System.out.println("---Usuario atualizado com sucesso---");
	}

}
