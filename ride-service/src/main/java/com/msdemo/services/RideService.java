package com.msdemo.services;

import com.msdemo.rideservice.grpc.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class RideService extends RideServiceGrpc.RideServiceImplBase {
    @Override
    public void findRides(RideSearchRequest request, StreamObserver<RideSearchResponse> responseObserver) {
        super.findRides(request, responseObserver);
    }

    @Override
    public void postRide(RideRequest request, StreamObserver<RideResponse> responseObserver) {
        super.postRide(request, responseObserver);
    }
}