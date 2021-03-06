package com.kodilla.library.ws;

import com.kodilla.courses.soap.GetBookRequest;
import com.kodilla.courses.soap.GetBookResponse;
import com.kodilla.library.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BooksEndpoint {

    private static final String NAMESPACE_URI = "http://kodilla.com/courses/soap";

    private final BooksRepository booksRepository;

    @Autowired
    public BooksEndpoint(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookRequest")
    @ResponsePayload
    public GetBookResponse getBook(@RequestPayload GetBookRequest request) {
        GetBookResponse response = new GetBookResponse();
        response.setBook(booksRepository.findBook(request.getSignature()));

        return response;
    }
}

