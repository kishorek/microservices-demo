package com.msdemo.services;

import com.msdemo.repositories.RideRepository;
import com.msdemo.rideservice.grpc.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class RideService extends RideServiceGrpc.RideServiceImplBase {

    @Autowired
    private RideRepository repository;

    @Override
    public void findRides(RideSearchRequest request, StreamObserver<RideSearchResponse> responseObserver) {
        
    }

    @Override
    public void postRide(RideRequest request, StreamObserver<RideResponse> responseObserver) {
        super.postRide(request, responseObserver);
    }
}
