// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumiverse.aquasec.outputs.GetHostAssurancePolicyScopeVariable;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetHostAssurancePolicyScope {
    private final String expression;
    private final @Nullable List<GetHostAssurancePolicyScopeVariable> variables;

    @CustomType.Constructor
    private GetHostAssurancePolicyScope(
        @CustomType.Parameter("expression") String expression,
        @CustomType.Parameter("variables") @Nullable List<GetHostAssurancePolicyScopeVariable> variables) {
        this.expression = expression;
        this.variables = variables;
    }

    public String expression() {
        return this.expression;
    }
    public List<GetHostAssurancePolicyScopeVariable> variables() {
        return this.variables == null ? List.of() : this.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHostAssurancePolicyScope defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expression;
        private @Nullable List<GetHostAssurancePolicyScopeVariable> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHostAssurancePolicyScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.variables = defaults.variables;
        }

        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public Builder variables(@Nullable List<GetHostAssurancePolicyScopeVariable> variables) {
            this.variables = variables;
            return this;
        }
        public Builder variables(GetHostAssurancePolicyScopeVariable... variables) {
            return variables(List.of(variables));
        }        public GetHostAssurancePolicyScope build() {
            return new GetHostAssurancePolicyScope(expression, variables);
        }
    }
}