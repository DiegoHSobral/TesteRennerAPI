package get.teste;




import org.junit.Test;

import io.restassured.RestAssured;


public class ConsultaUser {
	
	@Test
	public void consultaUsuario() {
		
		int id = 7;
		String uri = "https://reqres.in/api/users/";
			
		RestAssured.given()
		.contentType("application/json")
		.when().get(uri+id)
		.then().log().all()
		.statusCode(200);
		
		System.out.println("---Consulta realizada com sucesso---");
	}
	
	@Test
	public void consultaTodosUsuarios() {
		RestAssured.given()
		.contentType("application/json")
		.when().get("https://reqres.in/api/users?page=2")
		.then().log().all()
		.statusCode(200);
		
		System.out.println("---Consulta de todos os usuários realizado com sucesso---");
	}
	
	

}
