package Control;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Maker {

		private static EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("factory");

		private Maker() {
		}

		@Produces
		public static EntityManager getEntityManager() {
			return factory.createEntityManager();
		}

		public static void fecharFabrica() {
			factory.close();

	}
}
