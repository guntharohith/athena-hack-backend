import React from 'react'
import GridView from './GridView'
import ListView from './ListView'
import {useProductsContext} from '../context/products_context'
import { useFilterContext } from '../context/filters_context'
import Loading from './Loading'
import styled from 'styled-components'
function ProductsList(){
    const {filtered_products, grid_view } = useFilterContext()
    const {loading} = useProductsContext()
    if(loading){
        return(
            <Wrapper>
                <Loading className="loading" />
            </Wrapper>
        ) 
    }
    if(filtered_products.length < 1){
        return(
            <h3>Sorry, no results found...</h3>
        )
    }
    if (grid_view) {
        return <GridView products={filtered_products} />
    }
    return <ListView products={filtered_products} />

}
const Wrapper = styled.div`
    width:40vw;
`
export default ProductsList;