package com.project.FlightSearch.mapper;

import com.project.FlightSearch.domain.Flight;
import com.project.FlightSearch.dto.FlightDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface FlightMapper extends EntityMapper<FlightDTO, Flight> {

}
