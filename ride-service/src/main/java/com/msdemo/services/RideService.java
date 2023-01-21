package com.msdemo.services;

import com.msdemo.models.Ride;
import com.msdemo.repositories.RideRepository;
import com.msdemo.rideservice.grpc.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GrpcService
public class RideService extends RideServiceGrpc.RideServiceImplBase {

    @Autowired
    private RideRepository repository;

    @Override
    public void findRides(RideSearchRequest request, StreamObserver<RideSearchResponse> responseObserver) {
        List<Ride> rides = this.repository.findByFromAndTo(request.getFrom(),request.getTo());
        RideSearchResponse.Builder response = RideSearchResponse.newBuilder();
        for(Ride ride:rides){
            response.addRides(RideResponse.newBuilder().setFrom(ride.getFrom()).setTo(ride.getTo()).setId(ride.getId()).build());
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void postRide(RideRequest request, StreamObserver<RideResponse> responseObserver) {
        super.postRide(request, responseObserver);
    }
}
