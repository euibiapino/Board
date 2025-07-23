package br.com.dio.dto;

import br.com.dio.persistence.entity.BoardColumnKindEnum;

public record BoardColumnDTO(Long id, String nome, BoardColumnKindEnum kind, int cardsAmount) {

}
