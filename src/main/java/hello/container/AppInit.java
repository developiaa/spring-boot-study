package hello.container;

import jakarta.servlet.ServletContext;

// 애플리케이션 초기화 인터페이스
public interface AppInit {
    void onStartup(ServletContext servletContext);
}
