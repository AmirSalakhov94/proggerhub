package tech.itpark.proggerhub;

import tech.itpark.di.Container;
import tech.itpark.proggerhub.repository.UserRepository;
import tech.itpark.proggerhub.service.UserService;

public class Main {
    // psvm + Tab -> main
    public static void main(String[] args) {
        // TODO: MVP -> Minimal Valuable Product
        // videos
        // users/owners <-> consumers
        // Domain Model -> предметная область

        // 0. Plain Java (manual)
        // 1. Dependency Lookup -> Service Registry
        // 2. Dependency Injection -> Container:
        // 2.1 Сам делал new
        // 2.2 Найти нужные зависимости, если они требуются для new
        Container container = new Container();
        container.register(UserRepository.class, UserService.class);
        container.wire();

        System.out.println("dfdf");
    }
}
