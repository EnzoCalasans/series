package br.com.enzo.series.dto;

import br.com.enzo.series.model.Categoria;

public record SerieDTO(
        Long id,
        String titulo,
        String totalTemporadas,
        Integer avaliacao,
        Categoria genero,
        String atores,
        String poster,
        String sinopse
){

}


