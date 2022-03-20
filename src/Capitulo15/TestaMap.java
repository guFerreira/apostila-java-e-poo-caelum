package Capitulo15;

import br.com.caelum.contas.modelo.ContaCorrente;

import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class TestaMap {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("1");
        c1.depositar(10000);
        ContaCorrente c2 = new ContaCorrente("2");
        c2.depositar(3000);
        //	cria	o	mapa
        Map<String, ContaCorrente> mapaDeContas = new HashMap<>();
        //	adiciona	duas	chaves	e	seus	respectivos	valores
        mapaDeContas.put("diretor", c1);
        mapaDeContas.put("gerente", c2);
        ContaCorrente contaDoDiretor = mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());

        propertiesExemplo();
    }

    public static void propertiesExemplo() {
        Properties config = new Properties();
        config.setProperty("database.login", "scott");
        config.setProperty("database.password", "tiger");
        config.setProperty("database.url", "jdbc:mysql:/localhost/teste");
        //	muitas	linhas	depois...
        String login = config.getProperty("database.login");
        String password = config.getProperty("database.password");
        String url = config.getProperty("database.url");

        System.out.println("Login:"+ login);
        System.out.println("senha:"+ password);
        System.out.println("url:"+ url);

    }
}
