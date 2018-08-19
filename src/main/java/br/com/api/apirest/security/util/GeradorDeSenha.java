package br.com.api.apirest.security.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeradorDeSenha {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("ademir"));
		System.out.println(encoder.matches("ademir", "$2a$10$6bCGeHzSo/eba8p3XaHj0ekcbUdLL09uxxUwDPnjB8XMz4ptaxUj2"));
		
	}
}
