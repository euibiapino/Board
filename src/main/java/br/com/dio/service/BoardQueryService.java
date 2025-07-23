package br.com.dio.service;

import br.com.dio.persistence.dao.BoardColumnDAO;
import br.com.dio.persistence.dao.BoardDAO;
import br.com.dio.persistence.entity.BoardColumnEntity;
import br.com.dio.persistence.entity.BoardEntity;
import lombok.AllArgsConstructor;

import javax.swing.text.html.parser.Entity;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class BoardQueryService {

    private final Connection connection;

    public Optional<BoardEntity> findById(final Long id) throws SQLException {
        var dao = new BoardDAO(connection);
        var boardColumnDAO = new BoardColumnDAO(connection)
        var optinal = dao.findById(id);
        if(optinal.isPresent()){
            var entity = optinal.get();
            entity.setBoardColumns(boardColumnDAO.findByBoardId(Entity.getId()));
            return Optional.of(entity);
        }
        return Optional.empty();
    }

}
