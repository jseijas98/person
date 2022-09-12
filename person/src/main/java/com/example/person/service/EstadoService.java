package com.example.person.service;

import com.example.person.Repo.RepoEstado;
import com.example.person.model.Estado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class EstadoService implements RepoEstado {

    @Autowired
    private RepoEstado estadoRepo;


    @Override
    public List<Estado> findAll() {
        return estadoRepo.findAll();
    }

    public List<Estado> findAllByCountry (Long id){
        List<Estado> estadosRespuesta= new ArrayList<>();
        List<Estado> estados= estadoRepo.findAll();
        for (int i=0; i<estados.size(); i++) {
            if (estados.get(i).getPais().getId()==id) {
                estadosRespuesta.add(estados.get(i));
            }
        }
        return estadosRespuesta;
    }

    @Override
    public List<Estado> findAll(Sort sort) {
        return estadoRepo.findAll(sort);
    }

    @Override
    public List<Estado> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub

    }

    @Override
    public <S extends Estado> S saveAndFlush(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Estado> entities) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAllInBatch(Iterable<Estado> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {
        // TODO Auto-generated method stub

    }

    @Override
    public Estado getOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Estado getById(Long aLong) {
        return null;
    }

    @Override
    public Estado getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Estado> List<S> findAll(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> List<S> findAll(Example<S> example, Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<Estado> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Estado> findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Estado entity) {
        estadoRepo.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Estado> entities) {
        estadoRepo.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        estadoRepo.deleteAll();
    }

    @Override
    public <S extends Estado> Optional<S> findOne(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> Page<S> findAll(Example<S> example, Pageable pageable) {
        return estadoRepo.findAll(example, pageable);
    }

    @Override
    public <S extends Estado> long count(Example<S> example) {
        return estadoRepo.count(example);
    }

    @Override
    public <S extends Estado> boolean exists(Example<S> example) {
        return estadoRepo.exists(example);
    }

    @Override
    public <S extends Estado, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }


}
